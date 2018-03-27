package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>{
    override fun compareTo(other: MyDate) = when {
        year!=other.year ->year - other.year
        month!=other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }

}

operator fun MyDate.rangeTo(other: MyDate): DateRange {
   return DateRange(this,other)

}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(override  val start: MyDate, override val endInclusive: MyDate) : ClosedRange<MyDate> , Iterable<MyDate> {

    override fun iterator(): Iterator<MyDate> = DateIterator(this)

    override fun contains(value: MyDate): Boolean {
        return start<=value && value<=endInclusive
    }

}

class DateIterator(val dateRange: DateRange) : Iterator<MyDate> {


    var current: MyDate = dateRange.start
    override fun next(): MyDate {
        println("DateIterator is called");
        val result = current
        current = current.addTimeIntervals(TimeInterval.DAY, 1)
        return result
    }
    override fun hasNext(): Boolean = current <= dateRange.endInclusive
}
