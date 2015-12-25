using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using LeadisTeam.LeadisJourney.Core.Entities;
using LeadisTeam.LeadisJourney.Core.Repositories;
using LeadisTeam.LeadisJourney.Services.Contracts;

namespace LeadisTeam.LeadisJourney.Services
{
    public class AccountService : IAccountService {
        private readonly IAccountRepository _accountRepository;

        public AccountService(IAccountRepository accountRepository) {
            _accountRepository = accountRepository;
        }

        public void Create(string pseudo, string email, string name, string firstName, string password) {
            var account = new Account {
                Email = email,
                Password = password,
                IsOwner = false,
                Pseudo = pseudo,
                User = new User {
                    FirstName = firstName,
                    Name = name
                }
            };
            account.User.Account = account;
            _accountRepository.Save(account);
        }
    }
}
