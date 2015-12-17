using FluentNHibernate.Mapping;
using LeadisTeam.LeadisJourney.Core.Entities;

namespace LeadisTeam.LeadisJourney.Repositories.Map {
    public class AccountMap : ClassMap<Account> {
        public AccountMap() {
            Id(account => account.Id).GeneratedBy.Increment();
            Map(c => c.Pseudo);
            Map(c => c.Email);
            Map(c => c.IsAdmin);
            References(c => c.Group);
            HasOne(c => c.User);
            Table("accounts");
        }
    }
}