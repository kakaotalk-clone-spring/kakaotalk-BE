package com.example.KakaoTalk.common.response

import org.springframework.http.HttpStatus

enum class BaseResponseStatus(
    override val isSuccess: Boolean,
    override val code: Int,
    override val message: String
) : ResponseStatus {

    //200~ : 요청 성공
    SUCCESS(true, HttpStatus.OK.value(), "요청에 성공했습니다.")

    //400~ : 요청 실패
    ,REQUEST_ERROR(false, HttpStatus.BAD_REQUEST.value(), "요청에 실패했습니다.")
    ,RESPONSE_ERROR(false, HttpStatus.NOT_FOUND.value(), "값을 불러오는데 실패했습니다.")

    //500~ : 서버 오류
    ,DATABASE_ERROR(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), "데이터베이스 연결에 실패했습니다.")
    ,SERVER_ERROR(false, HttpStatus.INTERNAL_SERVER_ERROR.value(), "서버 내부에 오류가 발생했습니다.")
}