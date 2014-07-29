(ns reddit-fun.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(def questions ["What is your name?", "What is your age?", "What is your reddit user name?"])

(defn prompt-and-readline [prompt]
  (println prompt)
  (read-line))


(defn daily_programmer_1_easy []
  (let [answers (for [question questions] (prompt-and-readline question))]
    (str "your name is " (first answers) ", you are " (second answers) " years old, and your username is " (nth answers 2))))
