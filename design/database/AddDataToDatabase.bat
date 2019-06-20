@ECHO OFF

ECHO Adding: Create data for the database fptueventclub . . .
mysql --default-character-set=UTF8 -u fptueventclub -pFPTUEventClub@123 fptueventclub < FPTUEventClub_Script_StaticData.sql
