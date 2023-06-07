package com.example.composeexample

data class Message(
    val name: String,
    val content: String
)


val mockMessage: List<Message> = createMockMessage()

fun createMockMessage(): List<Message> {
    val result: ArrayList<Message> = arrayListOf()

    for (i in 0..10) {
        result.add(Message("냐벱$i", "다람쥐 집사 1\n ${i + 9000}"))
    }
    return result
}