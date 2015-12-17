using System;
using FluentNHibernate.Cfg;
using FluentNHibernate.Cfg.Db;
using LeadisTeam.LeadisJourney.Core.Repositories;
using NHibernate;

namespace LeadisTeam.LeadisJourney.Repositories {
	public class DbContext : IUnitOfWork { 
		private static FluentConfiguration _fluentConfiguration;
		private static ISessionFactory _sessionFactory;
		internal ISession Session => OpenSession();
		private ITransaction _transaction;

		public static ISession OpenSession() {
			if (_sessionFactory == null) {
				_sessionFactory = _fluentConfiguration.BuildSessionFactory();
			}
			return _sessionFactory.OpenSession();
		}
		protected static void Configuration(string host,
			int port, string database, string username, string password) {
			_fluentConfiguration = Fluently.Configure().Database(PostgreSQLConfiguration.Standard
				.ConnectionString(c => c.Host(host)
					.Port(port)
					.Database(database)
					.Username(username)
					.Password(password)));
		}

		protected static  FluentConfiguration MappingsConfiguration(Action<MappingConfiguration> mappings) {
			return _fluentConfiguration.Mappings(mappings);
		}

		public void BeginTransaction() {
			_transaction = Session.BeginTransaction();
		}

		public void Commit() {
			try {
				_transaction.Commit();
			}
			catch {
				_transaction.Rollback();
				throw;
			}
			finally {
				Session.Close();
			}
		}
	}
}
