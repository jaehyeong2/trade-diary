package jjfactory.trade_diary.service

import jjfactory.trade_diary.domain.TradeDiary
import jjfactory.trade_diary.repository.TradeDiaryRepository
import jjfactory.trade_diary.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate


@Service
class DiaryService(
    private val userRepository: UserRepository,
    private val tradeDiaryRepository: TradeDiaryRepository
) {

    @Transactional
    fun postDiary(title: String, content:String, userId: Long){
        val tradeDiary = TradeDiary(
            title = title,
            content = content,
            date = LocalDate.now(),
            userId = userId
        )

        tradeDiaryRepository.save(tradeDiary);
    }
}
