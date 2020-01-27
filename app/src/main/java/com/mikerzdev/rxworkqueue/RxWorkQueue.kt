package com.mikerzdev.rxworkqueue

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject


class SerialWorkQueue {


    private val queue: PublishSubject<Work> = PublishSubject.create()

    fun addWork(work: Work) {
        queue.onNext(work)
        queue.subscribe()
    }


    fun doWork() {

    }


    data class Work(val observable: Observable<Any>, val subscriber: Class<Any>)
}