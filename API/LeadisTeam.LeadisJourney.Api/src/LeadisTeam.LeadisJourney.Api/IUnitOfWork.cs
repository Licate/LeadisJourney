using Microsoft.AspNet.Http.Features;

namespace LeadisTeam.LeadisJourney.Api {
    public interface IUnitOfWork {
        void BeginTransaction();
        void Commit();
    }
}