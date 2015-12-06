namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class User : IEntity
    {
        //Only USER infos, all the other informations are in Account
        public int Id { get; set; }
        public string Name { get; set; }
        public string FirstName { get; set; }
    }
}