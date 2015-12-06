namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Exercice : IEntity
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public Source Source { get; set; }
        public int Position { get; set; }
        //Associated tutorial(s)
        public Tutorial Tutorial { get; set; }
        //The potential help doc
        public Source Help { get; set; }
    }
}