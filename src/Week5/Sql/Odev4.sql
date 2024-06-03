--film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.

SELECT DISTINCT replacement_cost FROM film ORDER BY replacement_cost;

--film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?

SELECT COUNT(DISTINCT replacement_cost) AS distinct_replacement_cost_count FROM film;

--film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?

SELECT COUNT(*) AS count_titles_with_T_and_G_rating FROM film WHERE title LIKE 'T%' AND rating = 'G';

--country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?

SELECT COUNT(*) AS count_5_char_countries FROM country WHERE LENGTH(country) = 5;

--city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?

SELECT COUNT(*) AS count_cities_ending_with_r FROM city WHERE city ILIKE '%r';