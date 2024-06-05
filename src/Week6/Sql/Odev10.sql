--city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.

SELECT c.Name AS city_name, co.Name AS country_name
FROM city c
LEFT JOIN country co ON c.CountryCode = co.CountryCode;

--customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.

SELECT p.payment_id, c.first_name, c.last_name
FROM customer c
RIGHT JOIN payment p ON c.customer_id = p.customer_id;

--customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

SELECT r.rental_id, c.first_name, c.last_name
FROM customer c
FULL JOIN rental r ON c.customer_id = r.customer_id;
