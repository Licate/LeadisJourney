using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using FluentNHibernate.Mapping;
using LeadisTeam.LeadisJourney.Core.Entities;

namespace LeadisTeam.LeadisJourney.Repositories.Map
{
    public class UserMap : ClassMap<User> {
        public UserMap() {
            Id(user => user.Id).GeneratedBy.Increment();
            HasOne(c => c.Account).PropertyRef(c => c.User);
            Map(c => c.FirstName);
            Map(c => c.Name);
            Table("users");
        }
    }
}
