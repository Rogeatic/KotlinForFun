fun main()
{
    val maximumAmount: Int = 10;
    var amount: Int;
    amount = 0;

    while (amount < maximumAmount){
        amount++;
        println(amount);
    }
    for (i in 1..5 step 1){
        println((amount+i))
    }

    if(amount > 5){
        println( multBy3( (amount * 10).toFloat() ) );
        println("super Cool");
    }
    else {
        println("Ten Billion");
    }
}
fun multBy3(input: Float): Float{
    return (input/3)
}