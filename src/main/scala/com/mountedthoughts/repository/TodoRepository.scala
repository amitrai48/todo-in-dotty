
package com.mountedthoughts.repository
import com.mountedthoughts.model.{User, Todo}

//TODO: can we make this a parametrized trait? 
trait TodoRepository {
  def (user: User) findAll(): List[Todo]
}

given todoImpl: TodoRepository {
  override def (user: User) findAll(): List[Todo] = ???
}