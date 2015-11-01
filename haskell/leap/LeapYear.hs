module LeapYear where
	isLeapYear :: Integer -> Bool
	isLeapYear x =
		mod x 4 == 0 && not (mod x 100 == 0 && not( mod x 400 == 0))
		
