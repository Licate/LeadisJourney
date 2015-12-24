using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Account : IEntity
    {
        public int Id { get; set; }
        public string Email { get; set; }
        public string Pseudo { get; set; }
        public IList<Group> Group { get; set; }
        public User User { get; set; }
        public bool IsOwner { get; set; }
        public IList<UserExperience> UserExperience { get; set; }
    }
}
