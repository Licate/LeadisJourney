namespace LeadisTeam.LeadisJourney.Core.Repositories {
    public interface IUnitOfWork {
        void BeginTransaction();
        void Commit();
    }
}