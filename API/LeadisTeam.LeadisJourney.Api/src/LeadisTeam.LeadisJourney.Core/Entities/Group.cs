namespace LeadisTeam.LeadisJourney.Core.Entities
{
    public class Group : IEntity
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public User Admin { get; set; }

        //AJOUTER LISTE DE USER APPARTENANT AU GROUPE ?????
    }
}