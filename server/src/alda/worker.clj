(ns alda.worker
  (:require #_[taoensso.timbre :as log]
            [taoensso.encore :as enc #_:refer #_(have have? qb)]
            #_[instaparse.core :as insta]))

(comment
  "Steps to reproduce:

   - `boot build -o /tmp`
   - In 4 separate terminals: `/tmp/alda -p 12345 worker`
   - Watch CPU usage on your computer as the worker processes start.

   With the timbre and instaparse requires, I am seeing CPU spikes of 150-200%
   for each worker process.

   Without them, < 5%.

   I've determined that the timbre CPU spike is caused by encore.

   Worth noting: I'm only seeing such large spikes when starting 4 worker
   processes simultaneously. When running only 1 worker process, the CPU spike
   is more like 30%.")

(defn start-worker!
  [port]
  (Thread/sleep 20000))

