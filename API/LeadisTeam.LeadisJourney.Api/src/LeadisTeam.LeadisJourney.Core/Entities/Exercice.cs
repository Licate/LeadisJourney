using System.Collections.Generic;

namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Exercice : IEntity
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public Source Source { get; set; }
        public int Position { get; set; }
        //Associated tutorial(s)
        public IList<Tutorial> Tutorials { get; set; }
        //The potential help doc
        public IList<Source> Help { get; set; }
    }
}