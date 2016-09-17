(ns alda.worker
  (:require [taoensso.timbre :as log]
            [instaparse.core :as insta]))

(comment
  "Steps to reproduce:

   - `boot build -o /tmp`
   - In 4 separate terminals: `/tmp/alda -p 12345 worker`
   - Watch CPU usage on your computer as the worker processes start.

   With the timbre and instaparse requires, I am seeing CPU spikes of 150-200%.

   Without them, < 5%.")

(defn start-worker!
  [port]
  (Thread/sleep 20000))

