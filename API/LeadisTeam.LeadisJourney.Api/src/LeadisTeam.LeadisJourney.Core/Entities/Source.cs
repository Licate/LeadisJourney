namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Source : IEntity
    {
        public int Id { get; set; }
        // Type of source (video, pdf etc)
        public string Type { get; set; }
        public string Content { get; set; }

        // CONTENT ??? Une string qui donne le path ??
    }
}