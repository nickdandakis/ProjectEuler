puts "Even Fibonacci numbers"
print "Find the sum of the even-valued fibonacci terms below: "
upperlimit = gets.chomp!.to_i

evenFibonacci = []
fibonacci = Enumerator.new { |fib|
	a,b = 0,1
	loop {
		fib << a
		a,b = b,a+b
		evenFibonacci << a if a.even?
	}
}

p fibonacci.take_while { |fib| fib < upperlimit }
p evenFibonacci.inject(:+) # Mmhmm, clean Ruby
