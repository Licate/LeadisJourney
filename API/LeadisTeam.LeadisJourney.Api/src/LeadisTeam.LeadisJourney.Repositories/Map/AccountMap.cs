using FluentNHibernate.Mapping;
using LeadisTeam.LeadisJourney.Core.Entities;

namespace LeadisTeam.LeadisJourney.Repositories.Map {
    public class AccountMap : ClassMap<Account> {
        public AccountMap() {
            Id(account => account.Id).GeneratedBy.Increment();
            Map(c => c.Pseudo);
            Table("accounts");
        }
    }
}