using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace LeadisTeam.LeadisJourney.Api.Models
{
    public class CreateAccountModel
    {
        public String Email { get; set; }
        public String Pseudo { get; set; }
        public String Password { get; set; }

        //User infos
        public String Name { get; set; }
        public String FirstName { get; set; }
    }
}
