using System.Collections.Generic;

namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Group : IEntity
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public IList<User> Admins { get; set; }
    }
}