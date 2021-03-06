puts "Multiples of 3 and 5"
print "Find the sum of all multiples of 3 or 5 below: "
upperlimit = gets.chomp!.to_i

result = (0...upperlimit).inject { |sum, n|
	sum + ((n.modulo(3).zero? or n.modulo(5).zero?) ? n : 0)
}
print result
