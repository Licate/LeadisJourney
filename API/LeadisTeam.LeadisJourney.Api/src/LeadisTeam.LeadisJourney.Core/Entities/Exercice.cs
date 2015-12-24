using System.Collections.Generic;

namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Exercice : IEntity
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public ExerciceSource Source { get; set; }
        public int Position { get; set; }
        //Associated tutorial(s)
        public IList<Tutorial> Tutorials { get; set; }
        //The potential help docs
        public IList<HelpSource> Helps { get; set; }
    }
}