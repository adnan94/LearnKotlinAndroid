package revo.adnan.com.learnkotln

import android.util.Log
import java.io.File
import java.lang.IllegalArgumentException

/**
 * Created by AdnanAhmed on 4/4/2018.
 */
public class PracticeClass : ParentClass() {

    //Functions﻿
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int = a - b

    fun returnNoMeaningfulValue(a: Int, b: Int): Unit {
        println("sum of a-$a and b-$b is ${a + b}")
    }

    fun concatination(a: Int, b: Int) {
        println("sum of a-$a and b-$b is ${a + b}")
    }

//    Variables﻿

    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred

    // val cannot be reassigned , it is read only
    // var is mutable , it is changeable or reassignable


    //Classes

    class Rectangle(var h: Int, var w: Int) {
        var perimeter = (h * w) + 10
    }

    fun callingPerimeter() {
        var perimeter = Rectangle(10, 9)
        println(perimeter)
    }


    open class Shape

    // to make a class inheritable, mark it as open.
    class Vector(var height: Double, var length: Double) : Shape() {
        var perimeter = (height + length) * 2
    }


    //    Conditional expressions﻿
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun max(a: Int, b: Int) = if (a > b) a else b


    //Loops
    var itemsList = listOf("Phone", "Laptop", "Powerbank", "Headphones")

    fun loops() {
        for (item in itemsList) {
            println("item : $item")
        }

        for (item in itemsList.indices) {
            println("item : ${itemsList[item]}")
        }

        var index = 0
        while (index < itemsList.size) {
            println("item : ${itemsList[index]}")
            index++;
        }


    }


    //When Expression
    fun whenExpression(obj: Any): String =
        when (obj) {
            "hello" -> "Hello there"
            is Long -> "Datatype long"
            !is String -> "Datatype not String"
            "hello" -> "Hello there"
            else -> "Unknown"
        }


    //    Ranges﻿
    fun ranges() {
        val x = 10
        val y = 9
        if (x in 1..y + 1) {
            println("fits in range")
        }

        val list = listOf("a", "b", "c")

        if (list.size !in list.indices) {
            println("list size is out of valid list indices range, too")
        }

        for (x in 1..10 step 2) {
            print(x)
        }
        //output : 13579

        for (x in 9 downTo 0 step 3) {
            print(x)
        }
        //output : 9630
    }


    fun collections() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    }

    fun idioms() {
        val list = listOf("banana", "avocado", "apple", "kiwifruit")

        val apples = list.filter { it.equals("apple") }
        if ("apple" in list) {
            println("apples here")
        }

    }

    fun maps() {

        val map = mapOf("a" to 1, "b" to 2, "c" to 3)
        println(map["a"])

        for ((a, v) in map) {
            println("hello  $a $v")
        }
    }


    //expression method
    fun maxOfs(a: Int, b: Int) = if (a > b) a else b

    //Creating single ton ??????????????????????
    object Resource {
        val name = "Name"
    }

//Lazy keyword ????????????????????????????
//    val p: String by lazy {
//        // compute the string
//    }


    /////////////////////////////abstract classes
    abstract class MyAbstractClass {
        abstract fun doSomething()
        abstract fun sleep()
    }

    fun main() {
        val myObject = object : MyAbstractClass() {
            override fun doSomething() {
                // ...
            }

            override fun sleep() { // ...
            }
        }
        myObject.doSomething()
    }

    fun shortHand() {

        ////////////////////////////////IF NULL PRINT EMPTY
        val files = File("Test").listFiles()
        print(files?.size ?: "empty")

        ///// if not null print size
        print(files?.size)


//        val values = ...
//        val email = values["email"] ?: throw IllegalStateException("Email is missing!")


        // not understand
//        Get first item of a possibly empty collection﻿
//        val emails = ... // might be empty
//        val mainEmail = emails.firstOrNull() ?: ""
//        Copied!
//        Execute if not null﻿
//        val value = ...
//
//        value?.let {
//            ... // execute this block if not null
//        }
//        Copied!
//        Map nullable value if not null﻿
//        val value = ...
//
//        val mapped = value?.let { transformValue(it) } ?: defaultValue
// defaultValue is returned if the value or the transform result is null.

    }

//    Builder-style usage of methods that return Unit﻿
//    fun arrayOfMinusOnes(size: Int): IntArray {
//        return IntArray(size).apply { fill(-1) }
//    }

    fun theAnswer() = 42

    //this is equivalent to
    fun theAnswers(): Int {
        return 42
    }


    fun transform(str: String): Int {
        return when (str) {
            "RED" -> 0
            "BLUE" -> 1
            "GREEN" -> 2
            else -> throw IllegalArgumentException("Invalid Color")
        }
    }

    fun test() {
        val result = try {
//            count()
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }

        // Working with result
    }

    fun foo(param: Int) {
        //If expression
        val result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "three"
        }
    }


    fun transformToWhenExpression(color: String): Int = when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }

    /////// nedd to explain
//    class Turtle {
//        fun penDown()
//        fun penUp()
//        fun turn(degrees: Double)
//        fun forward(pixels: Double)
//    }
//
//    val myTurtle = Turtle()
//    with(myTurtle) { //draw a 100 pix square
//        penDown()
//        for (i in 1..4) {
//            forward(100.0)
//            turn(90.0)
//        }
//        penUp()
//    }

///// need to understand
//    val myRectangle = Rectangle().apply {
//        length = 4
//        breadth = 5
//        color = 0xFAFAFA
//    }

    //////need to understand


//    fun ifElseForNullable() {
//        val b: Boolean? = ...
//        if (b == true) {
//            ...
//        } else {
//            // `b` is false or null
//        }
//}

    //need to understand
//    var a = 1
//    var b = 2
//    a = b.also { b = a }


//    val x: IntArray = intArrayOf(1, 2, 3)

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
//    val arr = IntArray(5)

    // Array of int of size 5 with values [42, 42, 42, 42, 42]
//    val arr = IntArray(5) { 42 }

    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
//    var arr = IntArray(5) { it * 1 }

//    if (obj is String) {
//        print(obj.length)
//    }
//
//    if (obj !is String) { // same as !(obj is String)
//        print("Not a String")
//    } else {
//        print(obj.length)
//    }


//    "Unsafe" cast operator﻿
//    val x: String = y as String
//    val x: String = y as String?

//    "Safe" (nullable) cast operator﻿
//    To avoid exceptions, use the safe cast operator as? that returns null on failure.
//    val x: String? = y as? String

//    if (something is List<*>) {
//        something.forEach { println(it) } // The items are typed as `Any?`
//    }

//    var max = a
//    if (a < b) max = b

    // As expression
//    val max = if (a > b) a else b

//    val max = if (a > b) {
//        print("Choose a")
//        a
//    } else {
//        print("Choose b")
//        b
//    }


//    when (x) {
//        0, 1 -> print("x == 0 or x == 1")
//        else -> print("otherwise")
//    }


//    when (x) {
//        in 1..10 -> print("x is in the range")
//        in validNumbers -> print("x is valid")
//        !in 10..20 -> print("x is outside the range")
//        else -> print("none of the above")
//    }


//    fun hasPrefix(x: Any) = when(x) {
//        is String -> x.startsWith("prefix")
//        else -> false
//    }

//    when {
////        x.isOdd() -> print("x is odd")
////        y.isEven() -> print("y is even")
////        else -> print("x+y is odd")
////    }

//    fun Request.getBody() =
//        when (val response = executeRequest()) {
//            is Success -> response.body
//            is HttpError -> throw HttpException(response.status)
//        }

//    for ((index, value) in array.withIndex()) {
//        println("the element at $index is $value")
//    }

//    for (i in array.indices) {
////        println(array[i])
////    }

//    while (x > 0) {
//        x--
//    }
//
//    do {
//        val y = retrieveData()
//    } while (y != null)


    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return // non-local return directly to the caller of foo()
            print(it)
        }
        println("this point is unreachable")
    }


//    Break and continue labels﻿
//    loop@ for (i in 1..100) {
//        for (j in 1..100) {
//            if (...) break@loop
//        }
//    }

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach {
//            if (it == 3) return // non-local return directly to the caller of foo()
//            print(it)
//        }
//        println("this point is unreachable")
//    }

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach lit@{
//            if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
//            print(it)
//        }
//        print(" done with explicit label")
//    }

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach {
//            if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
//            print(it)
//        }
//        print(" done with implicit label")
//    }

//    fun foo() {
//        listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
//            if (value == 3) return  // local return to the caller of the anonymous function - the forEach loop
//            print("$value yoo")
//        })
//        print(" done with anonymous function")
//    }

//    fun foo() {
//        run loop@{
//            listOf(1, 2, 3, 4, 5).forEach {
//                if (it == 3) return@loop // non-local return from the lambda passed to run
//                print(it)
//            }
//        }
//        print(" done with nested loop")
//    }


//    try {
//        // some code
//    } catch (e: SomeException) {
//        // handler
//    } finally {
//        // optional finally block
//    }

//    val a: Int? = try { parseInt(input) } catch (e: NumberFormatException) { null }

//    if name is null then throw exception
//    val s = person.name ?: throw IllegalArgumentException("Name required")

//    val s = person.name ?: fail("Name required")
//    println(s)


    //Classess and Objects

//primary constructor
//    class Person constructor(firstName: String) { /*...*/ }


//    If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
//    class Person(firstName: String) { /*...*/ }


//    class InitOrderDemo(name: String) {
//slso keyword set as well as print
//        val firstProperty = "First property: $name".also(::println)
//
//        init {
//            println("First initializer block that prints ${name}")
//        }
//
//        val secondProperty = "Second property: ${name.length}".also(::println)
//
//        init {
//            println("Second initializer block that prints ${name.length}")
//        }
//    }


//    class Customer public @Inject constructor(name: String) { /*...*/ }

//    class Constructors {
//        init {
//            println("Init block")
//        }
//
//        constructor(i: Int) {
//            println("Constructor $i")
//        }
//    }


    //????????????????????????????????????????????????????????
    class Person(val name: String) {
        var children: MutableList<Person> = mutableListOf()

        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    }


//    Abstract classes﻿
//    A class and some of its members may be declared abstract. An abstract member does not have an implementation in its class. You don't need to annotate an abstract class or function with open.

//    You can override a non-abstract open member with an abstract one.

//    open class Polygon {
//        open fun draw() {}
//    }
//
//    abstract class Rectangle : Polygon() {
//        abstract override fun draw()
//    }

//    open class Base(p: Int)
//
//    class Derived(p: Int) : Base(p)


//    open class Shape {
//        open fun draw() { /*...*/ }
//        fun fill() { /*...*/ }
//    }
//
//    class Circle() : Shape() {
//        override fun draw() { /*...*/ }
//    }

//    open class Shape {
//        open val vertexCount: Int = 0
//    }
//
//    class Rectangle : Shape() {
//        override val vertexCount = 4
//    }

//open class Rectanglee {
//    open fun draw() { println("Drawing a rectangle") }
//    val borderColor: String get() = "black"
//}
//
//    class FilledRectangle : Rectanglee() {
//        override fun draw() {
//            super.draw()
//            println("Filling the rectangle")
//        }
//
//        val fillColor: String get() = super.borderColor
//    }


//    open class Rectangle {
//        open fun draw() { /* ... */ }
//    }
//
//    interface Polygon {
//        fun draw() { /* ... */ } // interface members are 'open' by default
//    }
//
//    class Square() : Rectangle(), Polygon {
//        // The compiler requires draw() to be overridden:
//        override fun draw() {
//            super<Rectangle>.draw() // call to Rectangle.draw()
//            super<Polygon>.draw() // call to Polygon.draw()
//        }
//  }
//

//    interface MyInterface {
//    fun bar()
//    fun foo() {
//        // optional body
//    }

//}

//    class Child : MyInterface {
//        override fun bar() {
//            // body
//        }
//    }

//    interface MyInterface {
//        val prop: Int // abstract
//
//        val propertyWithImplementation: String //////////////////////////////?????????????????
//            get() = "foo"
//
//        fun foo() {
//            print(prop)
//        }
//    }
//
//    class Child : MyInterface {
//        override val prop: Int = 29
//    }


//    interface Named {
//        val name: String
//    }
//
//    interface Person : Named {
//        val firstName: String
//        val lastName: String
//
//        override val name: String get() = "$firstName $lastName"
//    }
//
//    data class Employee(
//        // implementing 'name' is not required
//        override val firstName: String,
//        override val lastName: String,
//        val position: Position
//    ) : Person

    interface A {
        fun foo() {
            print("A")
        }

        fun bar()
    }

    interface B {
        fun foo() {
            print("B")
        }

        fun bar() {
            print("bar")
        }
    }

    class C : A {
        override fun bar() {
            print("bar")
        }
    }

    class D : A, B {
        override fun foo() {
            super<A>.foo()
            super<B>.foo()
        }

        override fun bar() {
            super<B>.bar()
        }
    }


//    fun interface IntPredicate {
//        fun accept(i: Int): Boolean
//    }
//    val isEven = IntPredicate { it % 2 == 0 }


    open class AA {

        open val abc = 22

    }

    class BB : AA() {
        override val abc = 1
    }

//    A nested class marked as inner can access the members of its outer class. Inner classes carry a reference to an object of an outer class:

    class Outer {
        private val bar: Int = 1

        inner class Inner {
            fun foo() = bar
        }
    }

    val demo = Outer().Inner().foo() // == 1


    interface OuterInterface {
        class InnerClass
        interface InnerInterface
    }

    class OuterClass {
        class InnerClass
        interface InnerInterface
    }

    enum class Direction {
        NORTH, SOUTH, WEST, EAST
    }

//    Enum constants can also declare their own anonymous classes with their corresponding methods, as well as overriding base methods.

    enum class ProtocolState {
        WAITING {
            override fun signal() = TALKING
        },

        TALKING {
            override fun signal() = WAITING
        };

        abstract fun signal(): ProtocolState
    }

    fun foo(
        bar: Int = 0,
        baz: Int
    ) { /*...*/
    }

    fun oppo() {
        foo(3)
        foo()
        foo(1, 2)
    }


    /// Uni means Viod in kotlin
    fun fooo(
        bar: Int = 0,
        baz: Int = 1,
        qux: () -> Unit
    ) { /*...*/
    }

    fun callingFoo() {
        fooo(1) { println("hello") }     // Uses the default value baz = 1
        fooo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
        fooo { println("hello") }

    }

    fun double(x: Int): Int = x * 2

//    Variable number of arguments (Varargs)﻿
//    You can mark a parameter of a function (usually the last one) with the vararg modifier:

    fun <T> asList(vararg ts: T): List<T> {
        val result = ArrayList<T>()
        for (t in ts) // ts is an Array
            result.add(t)
        return result
    }

//INFIX NOTATION

//    They must be member functions or extension functions.
//
//    They must have a single parameter.
//
//    The parameter must not accept variable number of arguments and must have no default value.

//    infix fun Int.shl(x: Int): Int { ... }
//
//// calling the function using the infix notation
//    1 shl 2
//
//// is the same as
//    1.shl(2)

    class MyStringCollection {
        infix fun add(s: String) { /*...*/
        }

        fun build() {
            this add "abc"   // Correct
            add("abc")       // Correct
            //add "abc"        // Incorrect: the receiver must be specified
        }
    }


//    Local functions﻿
//    Kotlin supports local functions, which are functions inside another function:
//
//    fun dfs(graph: Graph) {
//        fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
//            if (!visited.add(current)) return
//            for (v in current.neighbors)
//                dfs(v, visited)
//        }
//
//        dfs(graph.vertices[0], HashSet())
//    }

//
//    Ceiling of '84.6' = 85.0
//    Floor of '84.6' = 84.0
//    Ceiling of '0.45' = 1.0
//    Floor of '0.45' = 0.0

//    val nullableList: List<Int?> = listOf(1, 2, null, 4)
//    val intList: List<Int> = nullableList.filterNotNull()

//    The !! operator﻿
//    val l = b!!.length

//    Safe casts
//val aInt: Int? = a as? Int

//    val l = b?.length ?: -1

//    val listWithNulls: List<String?> = listOf("Kotlin", null)
//    for (item in listWithNulls) {
//        item?.let { println(it) } // prints Kotlin and ignores null
//    }

}


