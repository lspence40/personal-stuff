# some simple code i wrote for stats class that makes histograms
# only works with positive numbers
# for now

nums = [89, 89, 78, 85, 83, 96, 63, 78, 94, 78, 89, 87, 72, 74, 89, 76, 72, 81, 81, 85, 75, 85, 72, 100, 74, 83, 61, 81, 74, 55, 76, 91, 76, 80, 79, 67, 57, 76, 78, 93, 91, 83, 72, 67, 96, 85, 93, 70, 76, 83]
barWidth = 5 # things the user can and should change


bars = []
for num in nums: # repeat for every entry in nums
    done = False
    
    while num >= len(bars) * barWidth: # no out of bounds errors today
        bars.append('')
    
    bar = 0
    while not done:
        if num >= bar * barWidth and num < (bar * barWidth) + barWidth: # add the current number where it belongs on the graph
            bars[bar] += '*'
            done = True
        else:
            bar += 1

skipping = True
for i in range(len(bars)):
    if not bars[i] == '': # don't print all the empty bars at the start
        skipping = False
    
    if not skipping:
        print(str(i * barWidth) + ':  \n\t' + str(bars[i])) # print all the bars
