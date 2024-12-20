package jjfactory.trade_diary.repository

import jjfactory.trade_diary.domain.Auth
import jjfactory.trade_diary.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface AuthRepository: JpaRepository<Auth, Long> {

}
