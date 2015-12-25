using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using LeadisTeam.LeadisJourney.Core.Entities;
using LeadisTeam.LeadisJourney.Core.Repositories;

namespace LeadisTeam.LeadisJourney.Repositories
{
    public class AccountRepository : Repository<Account>, IAccountRepository {
        public AccountRepository(IUnitOfWork unitOfWork) : base(unitOfWork) {
        }
    }
}
