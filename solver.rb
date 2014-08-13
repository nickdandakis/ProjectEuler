puts "Project Euler Solver"
print "Solve problem: "
input = gets.chomp!

def solve(problem)
	# needs checking here
	require "./#{problem.to_i}.rb"
end

solve(input)
