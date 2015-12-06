namespace LeadisTeam.LeadisJourney.Core.Repositories.Contracts {
    public interface IUnitOfWork {
        void BeginTransaction();
        void Commit();
    }
}