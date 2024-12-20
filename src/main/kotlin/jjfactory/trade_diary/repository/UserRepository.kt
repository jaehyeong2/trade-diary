package jjfactory.trade_diary.repository

import jjfactory.trade_diary.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {

}
