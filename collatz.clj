(ns collatz.collatz)
(defn 
  #^{:doc "WISB SOLVE"}
  collatz [n] 
  (if (= n 1) 
      '(1) 
      (cons n 
            (collatz (if (= (mod n 2) 0) 
                         (/ n 2) 
                         (+ (* n 3) 1))))))