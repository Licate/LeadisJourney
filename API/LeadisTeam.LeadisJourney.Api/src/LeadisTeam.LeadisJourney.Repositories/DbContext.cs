using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using FluentNHibernate.Cfg;
using FluentNHibernate.Cfg.Db;
using LeadisTeam.LeadisJourney.Repositories.Map;
using NHibernate;
using NHibernate.Cfg;

namespace LeadisTeam.LeadisJourney.Repositories
{
    //Pseudo instance de connexion à la DB (si elle plante, cela n'affecte pas les autres)
    public class DbContext
    {
        private static ISessionFactory _sessionFactory;

        static DbContext() {
            //Configure ma DB au lancement
            Configuration();
        }

        public static ISession OpenSession() {
            return _sessionFactory.OpenSession();
        }
        private static void Configuration() {
            _sessionFactory = Fluently.Configure().Database(PostgreSQLConfiguration.Standard
                .ConnectionString(c => c.Host("localhost")
                .Port(666)
                .Database("LeadisDB")
                // ça faudra pas le laisser comme ça...
                .Username("root")
                // ça non plus !
                .Password("Epitech")))
                //Map Account (avec ses champs et tout) dans ma DB
                .Mappings(c => c.FluentMappings.AddFromAssemblyOf<AccountMap>())
                .BuildSessionFactory();
        }
    }
}
