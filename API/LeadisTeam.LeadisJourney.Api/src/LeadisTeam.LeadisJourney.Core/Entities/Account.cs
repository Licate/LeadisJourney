using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Account : IEntity
    {
        public virtual int Id { get; set; }
        public virtual string Email { get; set; }
        public virtual string Pseudo { get; set; }
        public virtual string Password { get; set; }
        public virtual IList<Group> Group { get; set; }
        public virtual User User { get; set; }
        public virtual bool IsOwner { get; set; }
        public virtual IList<UserExperience> UserExperience { get; set; }
    }
}
