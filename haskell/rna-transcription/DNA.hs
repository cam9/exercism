module DNA where
 toRNA :: [Char] -> [Char]
 toRNA x | x == ['G']   = ['C']
         | x == ['C']   = ['G']
         | x == ['T']   = ['A']
         | x == ['A']   = ['U']
 toRNA (x:xs) = (toRNA [x]) ++ (toRNA xs)
         
