import com.mountedthoughts.model.{User, Todo}
import com.mountedthoughts.repository.TodoRepository

import cats.effect._
import cats.implicits._
import doobie._
import doobie.implicits._
import doobie.postgres._
import doobie.postgres.implicits._
import scala.concurrent.ExecutionContext

implicit val cs: ContextShift[IO] = IO.contextShift(ExecutionContext.global)

val xa = Transactor.fromDriverManager[IO](
  "org.postgresql.Driver", "jdbc:postgresql:world", "postgres", ""
)

case class Country(code: String, name: String, population: Long)

def find(n: String): ConnectionIO[Option[Country]] =
  sql"""select code, name, population from country where name = $n""".query[Country].option

@main def main(): Unit = 
  println("Hello world!")
  println(msg)

def msg = "I was compiled by dotty :)"

def getAll(todoRepository: TodoRepository, user: User): List[Todo] = 
  todoRepository.findAll(user)
