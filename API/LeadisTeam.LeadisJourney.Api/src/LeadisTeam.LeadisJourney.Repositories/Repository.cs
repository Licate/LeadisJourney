﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using LeadisTeam.LeadisJourney.Core.Entities;
using LeadisTeam.LeadisJourney.Core.Repositories;
using NHibernate;
using NHibernate.Linq;

namespace LeadisTeam.LeadisJourney.Repositories
{
    public class Repository<TEntity> : IRepository<TEntity> where TEntity : IEntity {

        protected ISession Session;
        public void Delete(TEntity entity) {
            Session.Delete(entity);
        }

        public IQueryable<TEntity> GetAll() {
            return Session.Query<TEntity>();
        }

        public TEntity GetById(int id) {
            return Session.Get<TEntity>(id);
        }

        public void Save(TEntity entity) {
            Session.SaveOrUpdate(entity);
        }
    }
}
