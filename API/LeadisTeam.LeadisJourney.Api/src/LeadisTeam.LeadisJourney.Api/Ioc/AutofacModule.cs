using Autofac;
using LeadisTeam.LeadisJourney.Core.Repositories;
using LeadisTeam.LeadisJourney.Repositories;
using LeadisTeam.LeadisJourney.Services;
using LeadisTeam.LeadisJourney.Services.Contracts;

namespace LeadisTeam.LeadisJourney.Api.Ioc {
	public class AutofacModule : Module {
		protected override void Load(ContainerBuilder builder) {
			builder.RegisterType<LeadisJourneyContext>()
				.As<IUnitOfWork>()
				.InstancePerLifetimeScope();
		    builder.RegisterType<AccountService>()
		        .As<IAccountService>();
		    builder.RegisterType<AccountRepository>()
		        .As<IAccountRepository>();
		}
	}
}