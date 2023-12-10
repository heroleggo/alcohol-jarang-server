package com.example.alcoholjarangserver.common

class CommonResponse<T>(
    val result: Result,
    val data: T? = null,
    val message: String? = null
) {
    companion object {
        fun <T> success(data: T, message: String) = CommonResponse(Result.SUCCESS, data, message);

        fun success(message: String) = CommonResponse(Result.SUCCESS, null, message)

        fun fail(message: String) = CommonResponse(Result.FAIL, null, message)

        fun <T> fail(data: T, message: String) = CommonResponse(Result.FAIL, data, message)
    }

    enum class Result {
        SUCCESS, FAIL
    }
}