package cz.albertov.st_application

class Udalost(_date: Int, _timeStart: Int, _timeEnd: Int, _town: String, _place: String, _note: String) {

    var date: Int //predelat na Date
    var timeStart: Int //predelat na Time
    var timeEnd: Int //predelat na Time
    var town: String
    var place: String
    var note: String

    init {
        date = _date
        timeStart = _timeStart
        timeEnd = _timeEnd
        town = _town
        place = _place
        note = _note
    }


}