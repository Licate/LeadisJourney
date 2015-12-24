using LeadisTeam.LeadisJourney.Core.Repositories;
using LeadisTeam.LeadisJourney.Repositories.Map;
using NHibernate.Tool.hbm2ddl;

namespace LeadisTeam.LeadisJourney.Repositories {
	public class LeadisJourneyContext : DbContext {
		static LeadisJourneyContext() {
			Configuration("localhost", 5432, "LeadisDB", "leadis", "2v9xYkpV5WX9");
			MappingsConfiguration(c => 
			c.FluentMappings.AddFromAssemblyOf<AccountMap>().AddFromAssemblyOf<UserMap>().AddFromAssemblyOf<TutorialMap>()
            .AddFromAssemblyOf<ExerciceSourceMap>().AddFromAssemblyOf<ExerciceMap>().AddFromAssemblyOf<GroupMap>()
            .AddFromAssemblyOf<UserExperienceMap>().AddFromAssemblyOf<TutorialSourceMap>().AddFromAssemblyOf<HelpSourceMap>()).ExposeConfiguration(
                config =>
                {
                    new SchemaExport(config).SetOutputFile("schema.sql").Execute(true, false, false);
                }).BuildConfiguration();
        }
	}
}