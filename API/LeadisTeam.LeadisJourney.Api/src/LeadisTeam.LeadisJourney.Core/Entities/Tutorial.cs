namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Tutorial : IEntity
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public Source Source { get; set; }
    }
}