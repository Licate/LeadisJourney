using LeadisTeam.LeadisJourney.Repositories.Map;

namespace LeadisTeam.LeadisJourney.Repositories {
	public class LeadisJourneyContext : DbContext {
		static LeadisJourneyContext() {
			Configuration("localhost", 666, "LeadisBd", "root", "epitech");
			MappingsConfiguration(c => 
			c.FluentMappings.AddFromAssemblyOf<AccountMap>());
		}
	}
}