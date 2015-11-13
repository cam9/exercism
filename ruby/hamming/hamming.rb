class Hamming
	VERSION = 1

	def self.compute(a, b)
		if a.length != b.length then
			raise ArgumentError, "msg", caller
		end
		dif = 0
		for i in 0..a.length - 1
			if a[i].chr != b[i].chr then
				dif = dif + 1
			end
		end
		return dif
	end
end
