using System.Linq;
using LeadisTeam.LeadisJourney.Core.Entities;

namespace LeadisTeam.LeadisJourney.Core.Repositories
{
    public interface IRepository<TEntity> where TEntity : IEntity {
        void Save(TEntity entity);
        void Delete(TEntity entity);
        TEntity GetById(int id);
        IQueryable<TEntity> GetAll();
    }
}