
package com.mountedthoughts.repository
import com.mountedthoughts.model.{User, Todo}

//TODO: can we make this a parametrized trait? 
trait TodoRepository
  def findAll(user: User): List[Todo]


class TodoRepositoryImpl() extends TodoRepository
  override def findAll(user: User): List[Todo] = 
    List()