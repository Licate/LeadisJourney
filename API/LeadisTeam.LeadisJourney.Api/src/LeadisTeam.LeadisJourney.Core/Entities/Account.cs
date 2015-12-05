using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Account : IEntity
    {
        public string Pseudo { get; set; }
        public int Id { get; set; }
    }
}
