using Autofac;
using LeadisTeam.LeadisJourney.Core.Repositories;
using LeadisTeam.LeadisJourney.Repositories;

namespace LeadisTeam.LeadisJourney.Api.Ioc {
	public class AutofacModule : Module {
		protected override void Load(ContainerBuilder builder) {
			builder.RegisterType<LeadisJourneyContext>()
				.As<IUnitOfWork>()
				.InstancePerLifetimeScope();
		}
	}
}